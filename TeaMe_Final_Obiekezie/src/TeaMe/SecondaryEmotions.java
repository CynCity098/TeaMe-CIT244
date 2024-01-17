/**
  * @author Cynthia Obiekezie 
  * CIT 244 Final
  * Fall 2023
 */
package TeaMe;

import java.util.Arrays;
import java.util.List;

public class SecondaryEmotions implements Emotion {

    @Override
    public List<Object> love(String s) {
        return Arrays.asList("Grateful","Sentimental", "Affectionate","Romantic", "Enthralled");
    }

    @Override
    public List<Object> fear(String s) {
        return Arrays.asList("Scared","Terrified", "Insecure","Nervous", "Horrified");
    }

    @Override
    public List<Object> anger(String s) {
        return Arrays.asList("Enraged","Exasperated", "Irritable","Jealous", "Disgusted");
    }

    @Override
    public List<Object> sadness(String s) {
        return Arrays.asList("Hurt","Unhappy", "Disappointed","Shameful", "Lonely","Gloomy");
    }

    @Override
    public List<Object> suprise(String s) {
        return Arrays.asList("Stunned","Confused", "Amazed","Overcome", "Moved");
    }

    @Override
    public List<Object> joy(String s) {
        return Arrays.asList("Peaceful","Content", "Happy","Optimistic", "Proud", "Excited");
    }
    
}
