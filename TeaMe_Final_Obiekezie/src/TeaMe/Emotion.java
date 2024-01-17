/**
  * @author Cynthia Obiekezie 
  * CIT 244 Final
  * Fall 2023
 */
package TeaMe;

import java.util.List;



/**
 * Emotion love = new Emotion();
 * set secondEmo
 * get sec return spice options:
 * set spice
 * get spice, return
 * 
 * secList[] = love.secondary()
 * 
 */

public interface Emotion {
    
    
//    public String[] secondaryEmotion(String emo);
//    public String[] spiceCabinet(String secEmo);
//    public void TeaOutput();
    
    public List<Object> love(String s);
    public List<Object> fear(String s);
    public List<Object> anger(String s);
    public List<Object> sadness(String s);
    public List<Object> suprise(String s);
    public List<Object> joy(String s);
   
}
