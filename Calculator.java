import java.awt.event.*;

import javax.swing.*;

public class TabelPerkalian {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator sederhana");

        JTextArea hasilArea = new JTextArea();
        hasilArea.setBounds(40,210, 200,200);
        frame.add(hasilArea);

        final JTextField input;
        input = new JTextField();
        input.setBounds(90,88,100,30);
        frame.add(input);
        
        JLabel labelHasil = new JLabel("Masukkan Angka Tabel");
        labelHasil.setBounds(80,50, 200,30);
        frame.add(labelHasil);

        JButton buttonTampilkan = new JButton("Tampilkan");
        buttonTampilkan.setBounds(90,130,100,30);
        buttonTampilkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = input.getText();
                int angka = Integer.parseInt(str);
                
                for(int i=1;i<11;i++){
                    hasilArea.setText(hasilArea.getText()+"\n"+angka+" x "+i+" = "+(angka*i));
                }
            }

        });

        JButton buttonReset = new JButton("Reset");
        buttonReset.setBounds(90,170,100,30);
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("");
                hasilArea.setText("");
            }

        });

        frame.add(buttonTampilkan);
        frame.add(buttonReset);

        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
