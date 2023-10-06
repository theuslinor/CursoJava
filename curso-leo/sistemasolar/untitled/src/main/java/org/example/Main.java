import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import org.jpl7.*;

public class SolSys {
    private static boolean viewVisible = false;
    private static JFrame frame;
    private static JPanel panel;
    private static JButton toggleViewButton;
    private static JTextArea planetData;

    public static void main(String[] args) {
        frame = new JFrame("SolSys");
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.add(panel);

        toggleViewButton = new JButton("Exibir Visualização 3D");
        toggleViewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                toggleView();
            }
        });
        panel.add(toggleViewButton);

        planetData = new JTextArea();
        panel.add(planetData);

        frame.setVisible(true);
    }

    private static void toggleView() {
        if (viewVisible) {
            // Ocultar a visualização 3D aqui
            viewVisible = false;
            toggleViewButton.setText("Mostrar Visualização");
        } else {
            // Exibir a visualização 3D aqui
            viewVisible = true;
            toggleViewButton.setText("Ocultar Visualização");
        }
    }

    // Outros métodos para listar planetas e mostrar dados aqui

    private static void listarPlanetas() {
        // Lógica para listar planetas aqui
    }

    private static void mostrarDados() {
        // Lógica para mostrar dados de planetas aqui
    }

    private static String[] planetas = {
            "Sol",
            "Mercúrio",
            "Vênus",
            "Terra",
            "Lua",
            "Marte",
            "Júpiter",
            "Saturno",
            "Urano",
            "Netuno",
            "Plutão"
    };

    private static JList<String> listaPlanetas;

    private static void listarPlanetas() {
        listaPlanetas = new JList<>(planetas);
        listaPlanetas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaPlanetas.setLayoutOrientation(JList.VERTICAL);
        listaPlanetas.setVisibleRowCount(-1);

        listaPlanetas.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                mostrarDados();
            }
        });

        JScrollPane scrollPane = new JScrollPane(listaPlanetas);
        panel.add(scrollPane);
    }

    private static void mostrarDados() {
        String selecionado = listaPlanetas.getSelectedValue();
        String dadosPlaneta = "Dados de " + selecionado + ":\n";

        // Lógica para obter e exibir os dados do planeta selecionado
        if (selecionado.equals("Sol")) {
            // Dados do Sol
            dadosPlaneta += "Propriedade 1: Valor 1\n";
            dadosPlaneta += "Propriedade 2: Valor 2\n";
            // ... (outras propriedades do Sol)
        } else if (selecionado.equals("Mercúrio")) {
            // Dados de Mercúrio
            // ...
        } else if (selecionado.equals("Vênus")) {
            // Dados de Vênus
            // ...
        }
        // Repita o padrão para outros planetas

        planetData.setText(dadosPlaneta);
    }
    public static void main(String[] args) {
        // ... (código anterior)
        listarPlanetas();
    }
}
}
