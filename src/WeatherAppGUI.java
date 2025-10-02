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
        addWeatherAndTemperature();
        addHumidityAndWindSpeed();

    }

    private void addSearchArea(){

        // searching text field
        JTextField searchTextField = new JTextField();
        searchTextField.setBounds(15,15,350,45);
        add(searchTextField);

        // searching button
        JButton searchButton = new JButton();
        searchButton.setBounds(380, 15, 45, 45);

        // change cursor's look when on searchButton
        searchButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        String fileName = "assets/search.png";

        // setting image of our button
        try{
            ImageIcon img = new ImageIcon(fileName);
            searchButton.setIcon(img);
        }catch(Exception e){
            e.printStackTrace();
        }

        add(searchButton);

    }

    private void addWeatherAndTemperature(){

        JLabel weatherImageLabel = new JLabel();
        weatherImageLabel.setBounds(103 , 100, 245, 217);

        try{
            // setting image of our weather
            ImageIcon weatherImage = new ImageIcon("assets/rain.png");
            weatherImageLabel.setIcon(weatherImage);
        }catch (Exception e){
            // throw error if any problem
            System.out.println("Couldn't find weather image");
            e.printStackTrace();
        }
        add(weatherImageLabel);

        // adding temperature text
        JLabel temperatureLabel = new JLabel("50 °C");

        // setting font for better visibility
        temperatureLabel.setFont(new Font("Roboto", 1, 30));

        // setting location and size of temperature label
        temperatureLabel.setBounds(200, 325, 100, 30);

        add(temperatureLabel);

    }

    private void addHumidityAndWindSpeed(){
        ///  creating humidity label
        JLabel humidityLabel = new JLabel();
        try{
            // setting image of humidity
            ImageIcon humidityImage = new ImageIcon("assets/humidity.png");
            humidityLabel.setIcon(humidityImage);
        }catch (Exception e){
            // throw error if any problem
            System.out.println("Couldn't find humidity image");
            e.printStackTrace();
        }

        // setting location and size
        humidityLabel.setBounds(15, 400, 104, 96);

        // setting text
        humidityLabel.setText("30 %");

        // aligning text to the bottom center of label
        humidityLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        humidityLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        // setting font for better visibility
        humidityLabel.setFont(new Font("Roboto", 1, 20));

        // adding label
        add(humidityLabel);

        /// creating wind speed label
        JLabel windSpeedLabel = new JLabel();
        try{
            // setting image
            ImageIcon windSpeedImage = new ImageIcon("assets/windspeed.png");
            windSpeedLabel.setIcon(windSpeedImage);
        }catch (Exception e){
            // adding error phases
            System.out.println("Couldn't find wind speed image");
            e.printStackTrace();
        }

        // setting size
        windSpeedLabel.setBounds(331, 400, 104, 96);

        // setting text
        windSpeedLabel.setText("30 km/h");

        // setting text location relative to label
        windSpeedLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
        windSpeedLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        // setting font of text
        windSpeedLabel.setFont(new Font("Roboto", 1, 20));

        // adding label
        add(windSpeedLabel);
   }

}