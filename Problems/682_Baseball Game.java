class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> game = new Stack<>();
        int i, res=0;
        for(i=0;i<ops.length;i++){
            if(ops[i].equals("+")){
                int t1 = game.pop();
                int t2 = game.peek();
                game.push(t1);
                game.push(t1 + t2);
                res += game.peek();
            }else if(ops[i].equals("C")){
                res -= game.peek();
                game.pop();
            }else if(ops[i].equals("D")){
                game.push(game.peek()*2);
                res += game.peek();
            }else{
                game.push(Integer.parseInt(ops[i]));
                res += game.peek();
            }
        }
        return res;
    }
}