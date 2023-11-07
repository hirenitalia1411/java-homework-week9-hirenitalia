package trainlinesatparticularstation;

import java.util.Arrays;
import java.util.HashMap;

public class FindTrainLines extends TrainLinesDatabase {

    public void findTrainLines(String sName){

        HashMap<String, String[]> lineMap = new HashMap<>();
        lineMap.put("Paddington", new String[]{"Bakerloo", "Circle", "District", "Hammersmith & City", "Elizabeth"});
        lineMap.put("Edgware Road", new String[]{"Bakerloo", "Circle", "District", "Hammersmith & City"});
        lineMap.put("Marylebone", new String[]{"Bakerloo", ""});
        lineMap.put("Baker Street", new String[]{"Bakerloo", "Circle", "Hammersmith & City", "Jubilee"});
        lineMap.put("Regent's Park", new String[]{"Bakerloo", ""});
        lineMap.put("Oxford Circus", new String[]{"Bakerloo", "Central", "Victoria"});
        lineMap.put("Piccadilly Circus", new String[]{"Bakerloo", "Piccadilly"});
        lineMap.put("Charing Cross", new String[]{"Bakerloo", "Northern"});
        lineMap.put("Embankment", new String[]{"Bakerloo", "Circle", "District", "Northern"});
        lineMap.put("Waterloo", new String[]{"Bakerloo", "Jubilee", "Northern", "Waterloo & City"});
        lineMap.put("Lambeth North", new String[]{"Bakerloo", ""});
        lineMap.put("Elephant & Castle", new String[]{"Bakerloo", "Northern"});
        lineMap.put("Notting Hill Gate", new String[]{"Central", "Circle", "District"});
        lineMap.put("Uqeensway", new String[]{"Central", ""});
        lineMap.put("Lancaster Gate", new String[]{"Central", ""});
        lineMap.put("Marble Arch", new String[]{"Central", ""});
        lineMap.put("Bond Street", new String[]{"Central", "Jubilee", "Elizabeth"});
        lineMap.put("Tottenham Court Road", new String[]{"Central", "Northern", "Elizabeth"});
        lineMap.put("Holborn", new String[]{"Central", "Piccadilly"});
        lineMap.put("Chancery Lane", new String[]{"Central", ""});
        lineMap.put("St. Paul's", new String[]{"Central", ""});
        lineMap.put("Bank", new String[]{"Central", "Circle", "District", "Northern", "Waterloo & City", "DLR"});
        lineMap.put("Liverpool Street", new String[]{"Central", "Circle", "Hammersmith & City", "Metropolitan", "Northern", "Elizabeth", "Overground"});
        lineMap.put("Great Portland Street", new String[]{"Circle", "Hammersmith & City", "Metropolitan"});
        lineMap.put("Euston Square", new String[]{"Circle", "Hammersmith & City", "Metropolitan"});
        lineMap.put("King's Cross", new String[]{"Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"});
        lineMap.put("Farringdon", new String[]{"Circle", "Hammersmith & City", "Metropolitan", "Elizabeth"});
        lineMap.put("Barbican", new String[]{"Circle", "Hammersmith & City", "Metropolitan"});
        lineMap.put("Moorgate", new String[]{"Circle", "Hammersmith & City", "Metropolitan", "Northern"});
        lineMap.put("Algate", new String[]{"Circle", "Metropolitan"});
        lineMap.put("Tower Hill", new String[]{"Circle", "District"});
        lineMap.put("Cannon Street", new String[]{"Circle", ""});
        lineMap.put("Mention House", new String[]{"Circle", "District"});
        lineMap.put("Blackfriars", new String[]{"Circle", "District"});
        lineMap.put("Temple", new String[]{"Circle", "District"});
        lineMap.put("Westminster", new String[]{"Circle", "District", "Jubilee"});
        lineMap.put("St. James' Park", new String[]{"Circle", "District"});
        lineMap.put("Victoria", new String[]{"Circle", "District", "Victoria"});
        lineMap.put("Sloane Square", new String[]{"Circle", "District"});
        lineMap.put("South Kensington", new String[]{"Circle", "District", "Piccadilly"});
        lineMap.put("Gloucester Road", new String[]{"Circle", "District", "Piccadilly"});
        lineMap.put("High Street Kensington", new String[]{"Circle", "District"});
        lineMap.put("Bayswater", new String[]{"Circle", "District"});
        lineMap.put("Earl's Court", new String[]{"District", ""});
        lineMap.put("Aldgate East", new String[]{"District", "Hammersmith & City"});
        lineMap.put("Green Park", new String[]{"Jubilee", "Piccadilly", "Victoria"});
        lineMap.put("Southwark", new String[]{"Jubilee"});
        lineMap.put("London Bridge", new String[]{"Jubilee", "Northern"});
        lineMap.put("Euston", new String[]{"Northern", "Victoria", "Overground"});
        lineMap.put("Angle", new String[]{"Northern"});
        lineMap.put("Old Street", new String[]{"Northern"});
        lineMap.put("Kensington", new String[]{"Northern"});
        lineMap.put("Leicester Square", new String[]{"Northern", "Piccadilly"});
        lineMap.put("Goodge Street", new String[]{"Northern"});
        lineMap.put("Warren Street", new String[]{"Northern", "Victoria"});
        lineMap.put("Nine Elme", new String[]{"Northern"});
        lineMap.put("Battersea", new String[]{"Northern"});
        lineMap.put("Knightbridge", new String[]{"Piccadilly"});
        lineMap.put("Hyde Park Corner", new String[]{"Piccadilly"});
        lineMap.put("Convent Garden", new String[]{"Piccadilly"});
        lineMap.put("Russell Square", new String[]{"Piccadilly"});
        lineMap.put("Pimlico", new String[]{"Victoria"});
        lineMap.put("Vauxhall", new String[]{"Victoria"});

        System.out.println(Arrays.toString(lineMap.get(sName)));
    }
}
