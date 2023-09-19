import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        SmartTV TV = new SmartTV();
        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Status atual: "+ TV.getStatus()+
                            "\nInternet: "+ TV.getNet()+
                            "\nCanal atual: "+ TV.getCanal()+
                            "\nVolume atual: "+ TV.getVolume()+
                            "\n\n 1 - Ligar/Desligar"+
                            "\n 2 - Mudar Canal"+
                            "\n 3 - Aumentar Volume"+
                            "\n 4 - Diminuir Volume"+
                            "\n 5 - Acessar a Internet" +
                            "\n 6 - Modo STREAMING"+
                            "\n 7 - Sair"
            ));

            switch (opcao){

                // Ligar / Desligar
                case 1 -> {
                    TV.ligar_desligar();
                }
                // Mudar Canal
                case 2 -> {
                    int canal = Integer.parseInt(JOptionPane.showInputDialog(
                            "---- Canais Disponíveis ----"+
                                    "\n | 1 | 3 | 5 | 7 | 11 |"
                    ));
                    if(canal == 1 || canal == 3 || canal == 5 || canal == 7 || canal == 11){
                        TV.trocar_canal(canal);
                    }else{
                        JOptionPane.showInputDialog(null,"Canal Inválido.");
                    }
                }

                // Aumentar Volume
                case 3 -> {
                    TV.aumentar_volume();
                }

                // Diminuir Volume
                case 4 -> {
                    TV.diminuir_volume();

                }

                // Acessar Internet
                case 5 ->{
                    TV.internet();
                }

                // Modo STREAMING
                case 6 -> {
                    if (Objects.equals(TV.getNet(), "Online")) {
                        int option;

                        do {
                            option = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Modo atual: STREAMING " +
                                            "\n 1 - Fazer Login" +
                                            "\n 2 - Mudar Login/Senha" +
                                            "\n 3 - Voltar para o Modo TV"
                            ));

                            switch (option) {

                                case 1 -> {

                                    int login, senha;

                                    login = Integer.parseInt(JOptionPane.showInputDialog(
                                            "login"
                                    ));
                                    senha = Integer.parseInt(JOptionPane.showInputDialog(
                                            "senha"
                                    ));
                                    if (login == TV.getLogin()) {
                                        if (senha == TV.getSenha()) {
                                            TV.setLogin(login, senha);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Senha Inválida!");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Login Inválido!");
                                    }
                                }

                                case 2 -> {

                                    int login, senha;

                                    login = Integer.parseInt(JOptionPane.showInputDialog(
                                            "login"
                                    ));
                                    senha = Integer.parseInt(JOptionPane.showInputDialog(
                                            "senha"
                                    ));
                                    TV.setLogin(login, senha);

                                }
                            }
                        } while (option != 3);
                    }else{
                        JOptionPane.showMessageDialog(null, "Você está Offline!");
                    }
                }
            }
        }while(opcao != 7);

    }





    }

}