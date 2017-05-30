import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntroGui extends JFrame{
	JTextField teks;
	JButton tombolIsi, tombolHapus;
	Container kanvas;

	IntroGui(){
		super("ini adalah judul");
		teks = new JTextField(25);
		tombolIsi = new JButton("isi");
		tombolIsi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				teks.setText("tulisan akan muncul");
			}
		});
		tombolHapus = new JButton("hapus");
		tombolHapus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				teks.setText("");
			}
		});
		kanvas = getContentPane();
		kanvas.setLayout(new FlowLayout());
		kanvas.add(tombolIsi);
		kanvas.add(tombolHapus);
		kanvas.add(teks);
		/** mengatur ukuran frame otomatis*/
		pack();
		/** agar jika di klik x (tombol close) aplikasi akan berhenti*/
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/** agar frame kelihatan*/
		setVisible(true);
	}

	public static void main(String[] args) {
		new IntroGui();
	}
}