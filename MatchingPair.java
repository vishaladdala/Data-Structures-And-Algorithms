 static int findMatchingPair(String input) {
        int res = -1;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0 ; i < input.length(); i++){
            char ch = input.charAt(i);
            
            if(Character.isUpperCase(ch)){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){break;}
                else{
                    if(stack.peek() == Character.toUpperCase(ch)){
                        res = i;
                        stack.pop();
                    }
                    else{
                        break;
                    }
                }
            }
        }

      return res;
    }


