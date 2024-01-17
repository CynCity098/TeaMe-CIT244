/**
  * @author Cynthia Obiekezie 
  * CIT 244
  * Fall 2023
 */
package TeaMe;

public class Tea{
    private String[] teaInfo;
//    private String infusion, core;
    
    public Tea(String c, String inf){
//        infusion = inf;
//        core = c;
        teaInfo = setTeaInfo(c,inf);
    }
    
    private String[] setTeaInfo(String c, String inf){
        switch(c.toLowerCase()){
            case "love":
                return love(inf);
            case "fear":
                return fear(inf);
            case "sadness":
                return sadness(inf);
            case "surprise":
                return suprise(inf);
            case "joy":
                return joy(inf);
            case "anger":
                return anger(inf);
            default:
                return new String[]{} ;
        }
    }
    public String[] getTeaInfo(){
        return this.teaInfo;
    }
    
    //Spiced tea
    private  String[] love(String inf) { 
        switch(inf.toLowerCase()){
            case "grateful":
                return new String[] {
                    "Sakuracha",
                    "A cup of Sakuracha tastes like "
                        + "lounging outside at a picnic with friends, "
                        + "lazily eating perfectly ripe cherries amidst hearty laughter. "
                        + "Expect the light cherry flavor to sweeten your day ", 
                    "anti-aging, anti-inflammatory, essential fatty acids, antioxidant",
                    "tea-options.png"
                };
            case "sentimental":
                return new String[] {
                    "Nigerian Tea",
                    "A warm drink more a-kin to western hot chocolate; "
                        + "this tea is not truly tea as the world knows it. "
                        + "Made with evaporated or powdered milk (preferably Peak),"
                        + " Nido Powdered Chocolate], sugar and boiled water, this drink is a memory capsule "
                        + "for many a Nigerian home. It is sentimental because of its very nature of longing for warmth and sharing a plate with family", 
                    "warmth, calming",
                    "tea-options.png"};
            case "affectionate":
                return new String[] {
                    "Ya Bao ",
                    "Distinguished with a sweet and fresh flavor that stands alone "
                        + "in the world of tea with a hint of honeysuckle in the aroma. "
                        + "The drinker is instantly transported to a grove of flowers, "
                        + "where they might spend hours watching the bees hard at work. "
                        + "This Chinese tea warms and soothes, lifting the spirit at any time of year", 
                    " improved cardiovascular function, cancer risk reduction, improved immune",
                    "tea-options.png"};
            case "romantic":
                return new String[]{
                    "Teecino’s Maca Chocolaté",
                    "a.k.a. “Peruvian Ginseng”, the maca root was heavily traded for its fertility boosting and aphrodisiac properties. "
                        + "Maca is still used for its energizing and libido-boosting properties today. This tea combines maca with other "
                        + "superfoods from the Incas, Aztecs, and Mayans like ramón, cocoa, and chilies ", 
                    "fertility, energy, endurance, protection from solar damage, free-radical protection",
                    "tea-options.png"};
            case "enthralled":
                return new String[] {
                    "Wuyi Shan Shui Xian ",
                    "This  Oolong tea is known as “water nymph” or “narcissus,” has a distinctive, warming aroma"
                        + " and a voluptuous taste that leaves a slightly nutty sweetness on the lips. Long leaves are wilted and hand-rolled "
                        + "into murky dark green s-shapes, which unravel to produce copper-colored infusions laden with the ephemeral playfulness "
                        + "of fairy spirits. Seductive, this variety will cause the tea-drinker to gaze off into the teacup for many blissful hours", 
                    "heart, brain, bone, and dental health. In addition, oolong tea may help decrease your risk for developing type 2 diabetes, aid in "
                        + "protecting you from certain types of cancer",
                    "tea-options.png"};
            default:
                return new String[]{} ;
        }
    }  

    private String[] fear(String inf) {
        switch(inf.toLowerCase()){
            case "scared":
                return new String[] {
                    "Woo Long",
                    "This Oolong tea’s dark green-brown leaves of various sizes, twisted into s-shapes, "
                        + "yield infusions of rich amber liquor, with a bittersweet taste that boasts of rye-bread or roasted nuts. An aroma and aftertaste of "
                        + "caramel soothes the palette and makes this tea a suitable accompaniment to desserts and snacks. Thick and filling, this Fujian classic "
                        + "is reputedly named “black dragon” because the opening leaves look like little dragons swimming in the pot", 
                    " Heart, brain, bone, and dental health. In addition, oolong tea may help decrease your risk for developing type 2 diabetes, aid in protecting you from certain types of cancer",
                    "tea-options.png"};
            case "terrified":
                return new String[] {
                    "Tung Ting",
                    "A celebrated, mildly roasted, slightly oxidized Oolong tea, Frozen Summit’s  leaves are squeezed when moist into little irregular "
                        + "oval shapes by a special pressing technique. This captivating variety dances with notes of caramel, chestnut, and warming chocolate, "
                        + "and it is imported from the slopes of the Tung Ting Mountains in Taiwan. Appropriate for drinking during contemplation as the shadows grow longer ", 
                    " powerful antioxidants known for fighting disease, specifically heart disease; ideal substitute for high-calorie drinks like soda and energy drinks",
                    "tea-options.png"};
            case "insecure":
                return new String[]{
                    "Yin Zhen",
                    "Its flavor is very subtle, yet velvety and earthy, with only the slightest hint of smoke and flowers with a touch of spiciness. Suitable for slowing down or becoming one with the moment ", 
                    "abundant in polyphenols, catechins and antioxidants. It also has antioxidant, anti-inflammatory, and antiaging properties and may prevent early wrinkles",
                    "tea-options.png"};
            case "nervous":
                return new String[]{
                    "Zhuan Cha",
                    "Lighter variety of characteristically bitter shou pu’er tea, this oxidized black brick may feature hints of toasted earth, mixed fruits, and honey."
                        + " It will remind you of the damp woodiness "
                        + "of winter when the snow JUST begins to melt", 
                    "significantly aid digestion, lower blood sugar, regulate metabolism",
                    "tea-options.png"};
            case "horrified":
                return new String[] {
                    "Ceylon Adam’s Peak",
                    "A black, high-mountain leaf tea from the Labookelie gardens in the Nurawa Eliya region of Sri Lanka. "
                        + "It is a frolicsome tea, dark that evokes the sweep of the gardens that spread out under the peaks of the "
                        + "Samanalakande Mountains, \"the mountains where butterflies go to die.\" "
                        + "Carries tart hints of currant", 
                    "regulating insulin and blood sugar levels, which reduces the risk of contracting diabetes",
                    "tea-options.png"};
            default:
                return new String[] {} ;
        }
    }

    private String[] anger(String inf) {
        switch(inf.toLowerCase()){
            case "enraged":
                return new String[] {
                    "Mini Bing Cha",
                    "Pressed into small “bing” disks emulating the burning sun, this tea pu’er requires a longer steep time, "
                        + "leaving an infusion almost as dark as coffee. The first sip can be a bitter surprise"
                        + " then coats with earth tastes that then mellow out", 
                    "energizer, cleanser, warming due to zing",
                    "tea-options.png"};
            case "exasperated":
                return new String[] {
                    "Bai Mu Dan",
                    "A beloved white tea which gives several infusions. Wild and sweet, the captivatingly subtle flavor hides the great strength of this tea. A yellowish liquor smiles up from the cup, "
                        + "reminiscent of waving sunflowers or a hot fall day well-spent in the garden. An excellent tea to calm the body and bring clarity to the mind", 
                    "improved cardiovascular function, cancer risk reduction, improved immune function, improved oral health",
                    "tea-options.png"};
            case "irritable":
                return new String[] {
                    "Tulsi Turmeric Ginger",
                    " Tulsi is a widely known herbal remedy that is exceptionally good for cleansing and immunity. Turmeric has and earthy and bitter taste to it, "
                        + "but this is balanced out with the other ingredients. "
                        + "It's zingy and tangy offering a slightly spicy flavor", 
                    "immune boost, focus, energy, gastrointestinal support",
                    "tea-options.png"};
            case "jealous":
                return new String[] {
                    "Dobra’s Eastern Winds",
                    "A succulent blend of jasmine, rose petals, violet leaf, rosehips, hibiscus, cinnamon, ginger, orange peel, star anise, and cloves. "
                        + "A tart combination that makes a bright red infusion in a cup", 
                    "Anti-aging, improve wrinkles, undereye, skin buoyancy, immune support",
                    "tea-options.png"};
            case "disgusted":
                return new String[] {
                    "Dobra’s Tummy Tamer",
                    "Made to calm the stomach, this mixture of caraway, ginger, lemon balm, peppermint, licorice, "
                        + "and chamomile is internally soothing and calming. This tisane will soothe a tumultuous stomach "
                        + "and satisfy your taste buds simultaneously", 
                    "gastrointestinal support, digestive supplement, calming, immune support",
                    "tea-options.png"};
            default:
                return new String[]{} ;
        }
    }

    private String[] sadness(String inf) {
       switch(inf.toLowerCase()){
              case "hurt":
                return new String[] {
                    "Wooricha",
                    "A fully oxidized, certified-organic tea from Korea with a classic cocoa fragrance. It is plucked and painstakingly processed entirely by hand. The slow, "
                        + "final high-firing of this tea give it an irresistible lingering aroma with pronounced flavors of chocolate, roasted barley, and savory baked cheddar", 
                    "High in vitamin C, relieves stress, fatigue, good for digestion",
                    "tea-options.png"};
              case "unhappy":
                return new String[] {
                    "Qing Tuo Cha",
                    "A “green pu’er” which is dried in the sun then pressed into nests, offers a smoky caramel, slightly astringent and milky feeling distinguishable "
                        + "from any other tea. In this sheng pu'er variety, one can taste in each cup the earthy, herbal tones of wild tea;  a wonderful companion to a cold evening "
                        + "or breezy morning just when the leaves are starting to appear on the trees", 
                    "Bone health, prevents cancers, fights free radicals, increased energy, heart health",
                    "tea-options.png"};
              case "disappointed":
                return new String[] {
                    "Ha Giang Cha Den",
                    "A tippy black, wild grown, with a beautiful deep crimson-purple hue and a rich aroma. It is produced in the Vietnamese "
                        + "mountains of Hà Giang. Hints of morello cherry add a slight sweetness to the tannins of this bold tea, tamed only by an experienced tea trekker. "
                        + "Each cup invokes a scene of waiting for the first snow that never comes on a chilly bitter morning, longing for tomorrow", 
                    "lower LDL cholesterol,  boosts immune system, reduces stress and anxiety",
                    "tea-options.png"};
              case "shameful":
                return new String[] {
                    "Tea that's just One Fruit",
                    "although they are delicious and tasty, this tea is looked down upon by true tea drinkers. "
                        + "A bastardization of the art of tea to quell unrefined pallets. You’re better off just biting into"
                        + " a marshmallow and calling it tea. Shake my head", 
                    "immune support, vitamin supplement etc. (can vary based on fruit)",
                    "tea-options.png"};
              case "lonely":
                return new String[] {"Bai Hao",
                    " A darker, bug-bitten oolong, and typical of this type, it is rounded with ambiguous floral, fruity, and malty flavors. A Taiwanese original, "
                        + "it is the superior class of semi-oxidized tea with "
                        + "a higher degree of oxidation and a great abundance of white tips. Most while reminiscing about picking mulberries on a damp fall day", 
                    "help remove dark under-eye circles, hydrate dry skin, fight fatigue : reduce fine lines and wrinkles- keeping your skin young and healthy",
                    "tea-options.png"};
              case "gloomy":
                return new String[] {
                    "Water and Lemon",
                    "Just water and lemon? Yikes, you must be SAD sad...", 
                    "vitamin C and hydration",
                    "tea-options.png"};
            default:
                return new String[]{} ;
        }
    }
 
    private String[] suprise(String inf) {
        switch(inf.toLowerCase()){
              case "stunned":
                return new String[] {"Dobra’s Manipur Wild Smoky",
                    "An exclusive, handmade, fire-dried, wild-harvested black tea from India. "
                        + "The Manipur region in Assam, India is rumored to be the origin of all tea trees. "
                        + "Full and round in the mouth, with subtle notes of caramel and smokiness. This unique offering is excellent "
                        + "for those seeking complex yet complimentary flavors to warm the soul", 
                    "High in thearubigins & theaflavin (antioxidant), carotenoids, amino acids, natural fibers, flavor Volatiles, theanine, Phenolic Acids & depsides, caffeine",
                    "tea-options.png"};
              case "confused":
                return new String[] {"Adagio’s Sweet & Sour",
                    "A blend with a touch of lemon for crisp tartness and beautiful color. Blended With Rose Hips, Hibiscus, Apple Pieces, "
                        + "Natural Apple Flavor, Natural Strawberry Flavor, Strawberries, Lemongrass, Orange, Natural Wild Cherry Flavor, Marigold Flowers & Lemon Grass", 
                    "Immune support, digestive health, antioxidant supplement",
                    "tea-options.png"};
              case "amazed":
                return new String[] {"Masala Chai",
                    "Brewed with black tea as its base, this milk tea is an Indian staple with added spices to create its signature. "
                        + "A recipe can include anything from cloves, cinnamon, ginger, turmeric, mints, cardamoms, pepper corn and more! "
                        + "It warms the body and can be healing in the winter", 
                    "immune health, energizer, relaxation",
                    "tea-options.png"};
              case "overcome":
                return new String[] {"Karala Masala Chai",
                    "Brewed with black tea as its base, this milk tea is an Indian staple with added spices to create its signature. "
                        + "With Mint Nana added that soothes and complements the masala flavors, this tea has a warm"
                        + " and loving twist with an air of sophistication", 
                    "immune support, antioxidants, relaxant",
                    "tea-options.png"};
              case "moved":
                return new String[] {"Nepal Dhankuta",
                    "With a golden hue and the soothing aroma of light chocolate and ripe fruit, this contribution is an event within a teapot. "
                        + "One sip is a dream of faraway mountains. A good tea to drink while reminiscing", 
                    "considerable amounts of antioxidants such as polyphenols and catechins ",
                    "tea-options.png"};
            default:
                return new String[]{} ;
        }

    }

    private String[] joy(String inf) {
        switch(inf.toLowerCase()){
              case "peaceful":
                return new String[] {"Chamomile",
                    "This herbal tea has gentle notes of apple, and there is a mellow, honey-like sweetness in the cup. "
                        + "It has a silky mouthfeel and yet remains a clean, delicately floral, and even from the very first "
                        + "sip it feels wonderfully soothing ", 
                    "reduce discomfort, reduces stress and inflammation, sleep aid",
                    "tea-options.png"};
              case "content":
                return new String[] {"Dobra’s Serenitea",
                    "A relaxing blend of lavender, tulsi, echinacea, nettles, and chamomile. This blend is considered helpful "
                        + "to the immune system, and it will help clear the mind. Good with honey", 
                    "reduce discomfort, stress, inflammation, promote sleep",
                    "tea-options.png"};
              case "happy":
                return new String[] {"Moli Hua Cha",
                    "A superior jasmine tea produced through seven successive cycles of blending in and removing jasmine flowers. "
                        + "It is especially suitable for drinking with close companions. The small, mossy-green leaves, flecked with "
                        + "white petals, hold a pervasive jasmine aroma, a distinctive lingering taste, and a mildly euphoric effect", 
                    "antioxidants for immune health, pain reduction, boost positivity and relaxation",
                    "tea-options.png"};
              case "proud":
                return new String[] {"Taiwanese Wild Purple",
                    "A remarkable large-leaved black tea, the leaves  produce a deep infusion, reminiscent of warm cedar mulch and faint cherry flavors. "
                        + "It is remarkably smooth on the tongue and finishes with the taste of red wine oak barrels that have been aired for about a week, "
                        + "with grass trimmings in the breeze. Long after the final sip, a lasting flavor of wildflower honey complete with honeycomb lingers in the palate", 
                    "Low in calories, Antioxidant-rich, May have anti-cancer properties",
                    "tea-options.png"};
              case "optimistic":
                return new String[] {"Lavender Teas ",
                    " Some blends offer hints of rosemary, some offer a smoky or woody flavor while others tend to be more floral and sweet. "
                        + "Lavender tea can also have hints of green apple, rose, and earthy notes similar to those found in green tea. "
                        + "The sky is the limit with this one", 
                    "promotes sleep, reduces pain and inflammation, stress relief",
                    "tea-options.png"};
              case "excited":
                return new String[] {"Shincha",
                    "This tea marks the first harvests of spring! In each cup you will taste youthful excitement and early brightness. "
                        + "In Japan, this green “First Tea” is reserved each year as a limited selection of tea in celebration of Spring", 
                    "richest nutrients including higher vitamins, amino acids, and antioxidants",
                    "tea-options.png"};
            default:
                return new String[]{} ;
        }
    }
}
