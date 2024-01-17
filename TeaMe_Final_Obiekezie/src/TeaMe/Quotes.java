/**
  * @author Cynthia Obiekezie 
  * CIT 244 Final
  * Fall 2023
 */
package TeaMe;

import java.util.HashMap;
import java.util.Map;

public class Quotes {
    public String getQuote(String spice){
        Map<String, String> myMap = new HashMap<String, String>() {{
   
            //love
            put("thankful", "“Be thankful for everything that happens in your life; it’s all an experience.”\n\t" +
                            "― Roy T. Bennett");
            put("blessed", "“Never to suffer would never to have been blessed.”\n" +
                            "― Edgar Allan Poe");
            put("nostalgic", "“Nostalgia is a longing for a place, but actually it is a yearning for a different time - the time of our childhood, the slower rhythms of our dreams. In a broader sense,"
                            + "nostalgia is a rebellion against the modern idea of time...”\n"
                            + "― Svetlana Boym, The Future of Nostalgia");
            put("tender", " “I think if I gave you my heart, you would treat it tenderly.”\n" 
                            +"― C.S. Pacat, Kings Rising");
            put("compassionate", "“You have not lived today until you have done something for someone who can never repay you.”\n" +
                                 "― John Bunyan");
            put("warmhearted", "“Powerful words, a soft embrace, & facial expression that can warm your heart. Growth shows you to appreciate what you didn't before.”\n" +
                                "― April Mae Monterrosa");
            put("enamored", "“Love knows no latitude, Love knows no longitude. Love only knows to be, Annihilated in servitude.”\n" +
                            "― Abhijit Naskar");
            put("infatuated", "“When you are madly in love with someone, even when sanity tries to rescue you, you wrestle it.”\n" +
                                "― Matshona Dhliwayo");
            put("enchanted", "“Return to the purity of your innocence where you are enchanted with life. Give love for no reason. Surround yourself with others doing the same.”\n" +
                                "― Miguel Angel Ruiz");
            put("passionate", "“Passion will always move you in the direction of your authentic self.”\n" +
                                "― Danielle LaPorte");
           
            //fear
            put("frightened", "“All men are frightened. The more intelligent they are, the more they are frightened.”\n" +
                                "― George S. Patton");
            put("helpless", "“I've never been helpless, I just have powerful enemies.”\n" +
                                "― Christopher Paolini");
            put("panicked", "“Panic causes tunnel vision. Calm acceptance of danger allows us to more easily assess the situation and see the options.”\n" +
                                "― Simon Sinek");
            put("hysterical", "“Pain is real when you get other people to believe in it. If no one believes in it but you, your pain is madness or hysteria.”\n" +
                                "― Naomi Wolf");
            put("inferior", "“One of the processes of your life is to constantly break down that inferiority, to constantly reaffirm that I Am Somebody.”\n" +
                                "― Alvin Ailey");
            put("inadequate", "“Properly channeled, common feelings of inadequacy lead to powers of accomplishment.”\n" +
                                "― Robert Genn");
            put("worried", "“There is a great difference between worry and concern. A worried person sees a problem, and a concerned person solves a problem.”\n" +
                                "― Harold Stephens");
            put("anxious", "“\"Worrying is carrying tomorrow's load with today's strength- carrying two days at once. It is moving into tomorrow ahead of time. "
                            + "Worrying doesn't empty tomorrow of its sorrow, it empties today of its strength.”\n ― Corrie Ten Boom");
            put("mortified", "“I was mortified by the prospect of becoming hopelessly trapped in someone else's story.”\n" +
                               "― Lionel Shriver");
            put("dreadful", "“\"When we love, we are courageous; and courage has nothing to do with being fearless, it's about being willing to experience fear, even dread, to do what we must, without guarantee of outcome.”\n"
                            + " ― Vanna Bonta");
            
//anger
            put("hateful", "“Hating people is like burning down your own house to get rid of a rat.”\n" +
                            "― Harry Emerson Fosdick");
            put("hostile", "“War cannot be driven out by war, for the use of evil breeds more evil, hostility more hostility, and the use of force more force.”\n" +
                            "― Hans F. Sennholz");
            put("agitated", "“Agitation is the marshalling of the conscience of a nation to mold its laws.”\n" +
                            "― Robert Peel");
            put("frustrated", "“All successful people learn that success is buried on the other side of frustration.”\n" +
                            "― Tony Robbins");
            put("annoyed", "“People who think they know everything are a great annoyance to those of us who do.”\n" +
                            "― Isaac Asimov");
            put("aggravated", "“If you have a job without aggravations, you don't have a job.”\n" +
                            "― Malcolm Forbes");
            put("resentful", "“Resentment is like drinking poison and then hoping it will kill your enemies.”\n" +
                            "― Nelson Mandela");
            put("envious", "“Envy and jealousy stem from the fundamental inability to rejoice at someone else's happiness or success.”\n" +
                            "― Matthieu Ricard");
            put("contemptuous", "“You can have no influence over those for whom you have underlying contempt.”\n" +
                            "― Martin Luther King, Jr.");
            put("revolted", "“The young are generally full of revolt, and are often pretty revolting about it.”\n" +
                            "― Mignon McLaughlin");
            
//sadness
            put("agonized", "“When suffering knocks at your door and you say there is no seat for him, he tells you not to worry because he has brought his own stool.”\n" +
                            "― Chinua Achebe");
            put("disturbed", "distrub quote1");
            put("miserable", "“Constant misfortune brings this one blessing: Those whom it always assails, it eventually fortifies.”\n" +
                            "― Lucius Seneca1");
            put("disheartened", "“Sooner or later, many idealists transform themselves into disheartened realists who mistakenly believe that giving up is the same thing as being realistic.”\n" +
                            "― Seth Godin");
            put("dismayed", "“Do not take yourself too seriously. You have to learn not to be dismayed at making mistakes. No human being can avoid failures.”\n" +
                            "―Lawrence G. Lovasik");
            put("disrespected", "“Disrespect is the weapon of the weak.”\n" +
                            "― Alice Miller");
            put("displeased", "“Disappointments are inevitable; discouragement is a choice.”\n" +
                            "― Charles Stanley");
            put("regretful", "“Don't be so bitter about a bad experience from your past that you miss the opportunities in front of you.”\n" +
                            "― Robert Kiyosaki");
            put("guilty", "“Shame and guilt are noble emotions essential in the maintenance of civilized society, and vital for the development of some of the most refined and elegant qualities of human potential.”\n" +
                            "― Willard Gaylin");
            put("isolated", "“The walls of isolation are not as solid as your suffering makes them seem.”\n" +
                            "― Deepak Chopra");
            put("neglected", "“Stop running to those who ignore you and start running to those who adore you.”\n" +
                            "― Joseph Simmons");
            put("hopeless", "“\"There are no hopeless situations; there are only men who have grown hopeless about them.”\n" +
                            "― Clare Boothe Luce");
            put("depressed", "“Depression is a prison where you are both the suffering prisoner and the cruel jailer.”\n" +
                            "―  Dorothy Rowe");
           
            //surprise
            put("shocked", "“Disenchantment, whether it is a minor disappointment or a major shock, is the signal that things are moving into transition in our lives.”\n" +
                            "― William Throsby Bridges");
            put("bewildered", "“Life is all too wondrous sweet, and the world is so beautifully bewildered; it is the dream of an intoxicated divinity.”\n" +
                            "― Heinrich Heine");
            put("disillusioned", "“False beliefs can be every bit as consoling as true ones, right up until the moment of disillusionment.”\n" +
                            "― Richard Dawkins");
            put("perplexed", "“If you are wholly perplexed and in straits, have patience, for patience is the key to joy.”\n" +
                            "― Rumi");
            put("astonished", "“Astonishment is the root of philosophy.”\n" +
                            "― Paul Tillich");
            put("impressed", "“It's far more impressive when others discover your good qualities without your help.”\n" +
                            "― Judith Martin");
            put("speechless", "“Experience is a private, very largely speechless affair.”\n" +
                            "― James A. Baldwin");
            put("astounded", "“Stars open among the lilies. Are you not blinded by such expressionless sirens? This is the silence of astounded souls.”\n" +
                            "― Sylvia Plath");
            put("touched", "“The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.”\n" +
                            "― Helen Keller");
            put("stimulated", "“Failure will never overtake me if my determination to succeed is strong enough.”\n" +
                            "―  Og Mandino");
            
            //joy
            put("pleased", "“Whenever you are sincerely pleased you are nourished.”\n" +
                            "― Ralph Waldo Emerson");
            put("serene", "“Serenity comes when you trade expectations for acceptance.”\n" +
                            "― Gautama Buddha");
            put("calm", "“When the mind is calm, how quickly, how smoothly, how beautifully you will perceive everything.”\n" +
                            "― Paramahansa Yogananda");
            put("satisfied", "“I am content; that is a blessing greater than riches; and he to whom that is given need ask no more.”\n" +
                                "― Henry Fielding");
            put("delighted", "“We delight in the beauty of the butterfly, but rarely admit the changes it has gone through to achieve that beauty.”\n" +
                            "― Maya Angelou");
            put("jovial", "“Honest good humor is the oil and wine of a merry meeting, and there is no jovial companionship equal to that where the jokes are rather small and laughter abundant.”\n" +
                            "― Washington Irving");
            put("amused", "“A person who knows how to laugh at himself will never ceased to be amused.”\n" +
                            "― Shirley MacLaine");
            put("triumphant", "“Age was respected among his people, but achievement was revered. As the elders said, if a child washed his hands he could eat with kings.”\n" +
                              "― Chinua Achebe, Things Fall Apart");
            put("illustrious", "“The greatest ornament of an illustrious life is modesty and humility, which go a great way in the character even of the most exalted princes.”\n" +
                            "― Napoleon Bonaparte");
            put("hopeful", "“A hopeless man sees difficulties in every chance, but a hopeful person sees chances in every difficulty.”\n" +
                            "― Ali ibn Abi Talib");
            put("optimistic", "“The only limit to our realization of tomorrow will be our doubts of today.”\n" +
                            "― Franklin D. Roosevelt");
            put("enthusiastic", "“\"Success consists of going from failure to failure without loss of enthusiasm.”\n" +
                            "― Winston Churchill");
            put("jubilant", "“Joy is what happens to us when we allow ourselves to recognize how good things really are.”\n" +
                            "― Marianne Williamson");
            put("elated", "“Real elation is when you feel you could touch a star without standing on tiptoe.”\n" +
                            "― Doug Larson");
        }};  

    return myMap.get(spice.toLowerCase());
    }
}
