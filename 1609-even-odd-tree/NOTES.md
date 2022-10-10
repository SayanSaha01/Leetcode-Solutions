int size=q.size();
level++;
int prev = level%2==0?Integer.MIN_VALUE:Integer.MAX_VALUE;
for(int i=0;i<size;i++)
{
TreeNode node = q.poll();
if(level%2==0){
if(node.val%2==0 || node.val<=prev){
// false if value at even level is even or not strictly increasing
return false;
}
}
else{
if(node.val%2!=0 || node.val>=prev){
// false if value at odd level is odd or not strictly decreasing
return false;
}
}
prev = node.val;
if(node.left!=null)
q.offer(node.left);
if(node.right!=null)
q.offer(node.right);
}
}
return true;
}
}