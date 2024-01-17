/**
  * @author Cynthia Obiekezie 
  * CIT 244 Final
  * Fall 2023
 */
package TeaMe;

import java.util.Arrays;
import java.util.List;

public class SpiceCabinet implements Emotion {
    public  List<Object> love(String secondary) { 
        switch(secondary.toLowerCase()){
            case "grateful":
                return Arrays.asList("Thankful","Blessed");
            case "sentimental":
                return Arrays.asList("Nostalgic","Tender");
            case "affectionate":
                return Arrays.asList("Compassionate","Warmhearted");
            case "romantic":
                return Arrays.asList("Enamored","Infatuated");
            case "enthralled":
                return Arrays.asList("Enchanted","Passionate");
            default:
                return Arrays.asList("") ;
        }
    }  

    @Override
    public List<Object> fear(String s) {
        switch(s.toLowerCase()){
            case "scared":
                return Arrays.asList("Frightened","Helpless");
            case "terrified":
                return Arrays.asList("Panicked","Hysterical");
            case "insecure":
                return Arrays.asList("Inferior","Inadequate");
            case "nervous":
                return Arrays.asList("Worried","Anxious");
            case "horrified":
                return Arrays.asList("Mortified","Dreadful");
            default:
                return Arrays.asList("") ;
        }
    }

    @Override
    public List<Object> anger(String s) {
        switch(s.toLowerCase()){
            case "enraged":
                return Arrays.asList("Hateful","Hostile");
            case "exasperated":
                return Arrays.asList("Agitated","Frustrated");
            case "irritable":
                return Arrays.asList("Annoyed","Aggravated");
            case "jealous":
                return Arrays.asList("Resentful","Envious");
            case "disgusted":
                return Arrays.asList("Contemptuous","Revolted");
            default:
                return Arrays.asList("") ;
        }
    }

    @Override
    public List<Object> sadness(String s) {
       switch(s.toLowerCase()){
              case "hurt":
                  return Arrays.asList("Agonized","Disturbed");
              case "unhappy":
                  return Arrays.asList("Miserable","Disheartened");
              case "disappointed":
                  return Arrays.asList("Dismayed","Disrespected", "Displeased");
              case "shameful":
                  return Arrays.asList("Regretful","Guilty");
              case "lonely":
                  return Arrays.asList("Isolated","Neglected");
              case "gloomy":
                  return Arrays.asList("Hopeless","Depressed");
            default:
                return Arrays.asList("") ;
        }
    }

    @Override
    public List<Object> suprise(String s) {
        switch(s.toLowerCase()){
              case "stunned":
                  return Arrays.asList("Shocked","Bewildered");
              case "confused":
                  return Arrays.asList("Disillusioned","Perplexed");
              case "amazed":
                  return Arrays.asList("Astonished","Impressed");
              case "overcome":
                  return Arrays.asList("Speechless","Astounded");
              case "moved":
                  return Arrays.asList("Touched","Stimulated");
            default:
                return Arrays.asList("") ;
        }

    }

    @Override
    public List<Object> joy(String s) {
        switch(s.toLowerCase()){
              case "peaceful":
                  return Arrays.asList("Serene","Calm");
              case "content":
                  return Arrays.asList("Pleased","Satisfied");
              case "happy":
                  return Arrays.asList("Delighted","Jovial", "Amused");
              case "proud":
                  return Arrays.asList("Triumphant","Illustrious");
              case "optimistic":
                  return Arrays.asList("Hopeful","Optimistic");
              case "excited":
                  return Arrays.asList("Enthusiastic","Jubilant", "Elated");
            default:
                return Arrays.asList("") ;
        }
    }
    
}
