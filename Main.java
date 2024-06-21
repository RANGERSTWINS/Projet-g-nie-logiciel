import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JFrame frame;
    private JPanel panel;
    private ButtonGroup reservationGroup;
    private JButton submitButton;

    public Main() {
        frame = new JFrame("Sélection de Réservation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel label = new JLabel("Quel type de réservation voulez-vous faire ?");
        panel.add(label);

        reservationGroup = new ButtonGroup();
        JRadioButton luxeButton = new JRadioButton("Réservation de Luxe");
        JRadioButton economiqueButton = new JRadioButton("Réservation Économique");

        reservationGroup.add(luxeButton);
        reservationGroup.add(economiqueButton);

        panel.add(luxeButton);
        panel.add(economiqueButton);

        submitButton = new JButton("Soumettre");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (luxeButton.isSelected()) {
                    faireReservationLuxe();
                } else if (economiqueButton.isSelected()) {
                    faireReservationEconomique();
                }
            }
        });
        panel.add(submitButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void faireReservationLuxe() {
        ReservationDirector director = new ReservationDirector();
        ReservationBuilder builder = new LuxuryReservationBuilder();
        construireEtAfficherReservation(director, builder);
    }

    private void faireReservationEconomique() {
        ReservationDirector director = new ReservationDirector();
        ReservationBuilder builder = new BudgetReservationBuilder();
        construireEtAfficherReservation(director, builder);
    }

    private void construireEtAfficherReservation(ReservationDirector director, ReservationBuilder builder) {
        director.setReservationBuilder(builder);
        director.constructReservation();
        HotelReservation reservation = director.getReservation();
        reservation.setStrategieTarification(new TarificationSaisonniere()); // Exemple de stratégie de tarification

        JOptionPane.showMessageDialog(frame, reservation.toString(), "Détails de la Réservation", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
