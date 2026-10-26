package metro;

public class Stations {

    int control ;
    String station[] = {
        "[College of Computing - Engineering - Business Administration - Cafeteria - Parking ]",
        "[Library - Student Affairs - Senior Administration - Dunkin - Classrooms] ",
        "[Sports Club]",
        "[College of Education and Arts]",
        "[College of Science ]",
        "[Grand Millennium Hotel]",
        "[the Mosque]",
        "[College of Medicine]",
        "[Technical College]",
        "[University Housing]"
        
            
    };
    
    
    void print() {
        for (int i = 0; i < station.length; i++) {
            System.out.println((i +1)+ "-" + station[i]);
            System.out.println("------------------------------------------------");
        }
    }

    void FromTo(int sta) {
         control = sta - 1;
        if (control >=0 && control < station.length) {
            System.out.println(station[control]);

        } else {
            System.out.println(" not found ! ");

            
        }

    }

    void searching(int checkStation) {
        control = checkStation - 1;
        if (control >= 0 && control < station.length) {
            System.out.println("Station found: " + station[control]);
        } else {
            System.out.println(" not Found ! ");
        }
    }

}
