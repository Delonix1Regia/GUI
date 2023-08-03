// Kalkulator sederhana menggunakan GUI


import java.awt.*; // untuk mengimpor kelas-kelas pada paket Abstract Window Toolkit
import java.awt.event.*; // paket spesifik untuk event
import javax.swing.*;

class Kalkulator extends JFrame implements ActionListener {
	public JLabel label1, label2, label3; // JLabel untuk membuat label
	public JTextField text1, text2, text3; // JTextfield untuk membuat text
	public JButton button1, button2, button3, button4; // JButton untuk membuat tombol

	public Kalkulator() {
		label1 = new JLabel("Nilai A "); // Judul label untuk textfield pertama
		label1.setLocation(10, 10); // untuk menentukan posisi
		label1.setSize(label1.getPreferredSize());
		
		text1 = new JTextField(20);
		text1.setLocation(10, 25); // untuk menentukan posisi
		text1.setSize(text1.getPreferredSize());

		label2 = new JLabel("Nilai B "); // Judul label untuk textfield kedua
		label2.setLocation(10, 45); // untuk menentukan posisi
		label2.setSize(label2.getPreferredSize());

		text2 = new JTextField(20);
		text2.setLocation(10, 60); // untuk menentukan posisi
		text2.setSize(text2.getPreferredSize());

		label3 = new JLabel("Hasil Perhitungan A dan B"); // Judul label untuk textfield ketiga
		label3.setLocation(10, 90); // untuk menentukan posisi
		label3.setSize(label3.getPreferredSize());

		text3 = new JTextField(20);
		text3.setLocation(10, 105); // untuk menentukan posisi
		text3.setSize(text3.getPreferredSize());

		button1 = new JButton("Tambah"); // tombol pertama untuk melakukan penjumlahan
		button1.setLocation(245, 10); // untuk menentukan posisi
		button1.setSize(button1.getPreferredSize());
		button1.addActionListener(this);
		button1.setMnemonic('T'); // menetapkan tombol pintasan, berarti Alt+T

		button2 = new JButton("Kurang"); // tombol pertama untuk melakukan pengurangan
		button2.setLocation(245, 40); // untuk menentukan posisi
		button2.setSize(button2.getPreferredSize());
		button2.addActionListener(this);
		button2.setMnemonic('U'); // menetapkan tombol pintasan, berarti Alt+U

		button3 = new JButton("Kali"); // tombol pertama untuk melakukan perkalian
		button3.setLocation(245, 70); // untuk menentukan posisi
		button3.setSize(button3.getPreferredSize());
		button3.addActionListener(this);
		button3.setMnemonic('K'); // menetapkan tombol pintasan, berarti Alt+K

		button4 = new JButton("Bagi"); // tombol pertama untuk melakukan pembagian
		button4.setLocation(245, 100); // untuk menentukan posisi
		button4.setSize(button4.getPreferredSize());
		button4.addActionListener(this);
		button4.setMnemonic('B'); // menetapkan tombol pintasan, berarti Alt+B
	}

	public void actionPerformed(ActionEvent ae) {
		double a = 0.0, b = 0.0, c = 0.0;
		// Membaca data dari textfield
		// If-else digunakan untuk melakukan perhitungan kalkulator
		try {
			a = Double.parseDouble(text1.getText());
			b = Double.parseDouble(text2.getText());
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		if (ae.getSource() == button1) {
			c = a + b;
		} else if (ae.getSource() == button2) {
			c = a - b;
		} else if (ae.getSource() == button3) {
			c = a * b;
		} else {
			c = a / b;
		}
		// menampilkan hasil pada textfield
		text3.setText(new String().valueOf(c));
	}

	public void tampilan() {
		JFrame.setDefaultLookAndFeelDecorated(true); // untuk mengaktifkan fitur dekorasi pada JFrame
		JFrame frame = new JFrame("Kalkulator");
		frame.setLayout(null); // untuk menentukan layout yang nantinya diatur pada setBounds
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // agar saat JFrame ditutup dapat menutup dengan sempurna

		// getContactPane digunakan untuk menampilkan konten
		frame.getContentPane().add(label1);
		frame.getContentPane().add(text1);

		frame.getContentPane().add(label2);
		frame.getContentPane().add(text2);

		frame.getContentPane().add(label3);
		frame.getContentPane().add(text3);

		frame.getContentPane().add(button1);
		frame.getContentPane().add(button2);
		frame.getContentPane().add(button3);
		frame.getContentPane().add(button4);

		frame.setBounds(0, 0, 350, 200); // rectangle
		frame.setLocationRelativeTo(null); // untuk menempatkan JFRame pada tengah layar
		frame.setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		javax.swing.SwingUtilities.invokeLater(new Runnable() { // method untuk menjalankan program
			public void run() {
				Kalkulator app = new Kalkulator();
				app.tampilan();
			}
		});
	}
}