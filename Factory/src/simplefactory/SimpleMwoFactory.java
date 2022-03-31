package simplefactory;

public class SimpleMwoFactory {
    public Mwo GetMwo(String MwoType){
        if (MwoType==null){
            return null;
        }
        if (MwoType.equals("Meidi")){
            return new MeidiMwo();
        }else if (MwoType.equals("Geli")){
            return new GeliMwo();
        }
        return null;
    }
}
