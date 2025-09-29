import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class WeatherAppGUI extends JFrame {

    public WeatherAppGUI(){

        // setting name of our GUI
        super("Weather App");

        // setting size of our GUI
        setSize(new Dimension(450, 600));

        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // making app's location center of the screen
        setLocationRelativeTo(null);

        // making our layout manager null to manually position our components within the GUI
        setLayout(null);

        // adding components
        addComponents();

    }

    // adding components
    private void addComponents(){

        addSearchArea();

        

    }

    private void addSearchArea(){

        // searching text field
        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(15,15,350,45);
        add(searchTextField);

        // searching button
        JButton searchButton = new JButton();
        searchButton.setBounds(380, 15, 45, 45);

        // setting image of our button
        try{
            ImageIcon img = new ImageIcon("assets/search.png");
            searchButton.setIcon(img);
        }catch(Exception e){
            e.printStackTrace();
        }

        add(searchButton);

    }

}
