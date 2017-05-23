public class FrogJump {
  private HashSet<Integer> members;
  private int target;
  public Solution(){
    members = new HashSet<Integer>();
  }
  
  public boolean recfun(int start,int jump){
    if(start + jump == target || start + jump - 1 == target || start + jump + 1 == target)
      return true;
    if(members.contains(start + jump + 1) && recfun(start + jump + 1,jump + 1))
      return true;
    if(members.contains(start + jump) && recfun(start + jump,jump))
      return true;
    if(jump >1 && members.contains(start + jump - 1) && recfun(start + jump - 1,jump - 1))
      return true;
    
    
    return false;
  }
  
    public boolean canCross(int[] stones) {
    int length = stones.length;
    if(length == 1)
      return true;
    if(stones[1] != 1)
      return false;
    target = stones[length - 1];
    for(int i = 0 ; i < length ; i++){
      if(i > 3 && stones[i] > stones[i-1] * 2)
        return false;
      members.add(stones[i]);
    }
    return recfun(1,1);
    }
}
