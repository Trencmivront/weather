import javax.swing.*;

public class App {
    public static void main(String[] args) {

        // for a thread safe run time we surround our launch faze with it
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    // launching our app
                    WeatherAppGUI app = new WeatherAppGUI();
                    app.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        }
    }