
public class UC7_OOPSBannerApp {

    
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        
        public String[] getPattern() {
            return pattern;
        }
    }

    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[0];
    }

    
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        int height = patterns[0].getPattern().length;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < word.length(); i++) {

                String[] pattern = getCharacterPattern(word.charAt(i), patterns);
                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }

    
    public static void main(String[] args) {

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        printBanner("OOPS", patterns);
    }
}