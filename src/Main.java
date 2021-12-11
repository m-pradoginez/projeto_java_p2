import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton cadastrarJogadorButton;
    private JTable table1;

    public Main() {
        try {
            table1.setModel(new DefaultTableModel(null, new String[]{"Nome do Jogador", "Data de Nascimento", "Número Camisa", "Time", "Posição"}));
            cadastrarJogadorButton.addActionListener(e -> {
                if (textField1.getText().equals("")||textField2.getText().equals("")||textField3.getText().equals("")||textField4.getText().equals("")||textField5.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos corretamente!");
                }
                else{
                    Jogador jogador = new Jogador();
                    jogador.nome = textField1.getText();
                    jogador.nascimento = textField2.getText();
                    jogador.numero = textField3.getText();
                    Jogador.time = textField4.getText();
                    Jogador.pos = textField5.getText();
                    String[][] data = {
                            {jogador.getNome(), jogador.getNascimento(), jogador.getNumero(), jogador.getTime(), jogador.getPos()}};
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    textField5.setText("");
                    JOptionPane.showMessageDialog(null, "Jogador adicionado com sucesso!");
                    table1.setModel(new DefaultTableModel(data, new String[]{"Nome do Jogador", "Data de Nascimento", "Número Camisa", "Time", "Posição"}));
                }

            });
        }
        catch (Exception e){
            System.out.println("Desculpe encontramos algum erro!");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
