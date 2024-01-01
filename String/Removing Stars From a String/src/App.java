public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public static String removeStars(String s) {
            StringBuilder result = new StringBuilder();
            
    
            for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == '*') {
                        result.deleteCharAt(result.length() - 1);
                    } else {
                        result.append(s.charAt(i));
                    }
                }
                return result.toString();
        }
    }

        
    


