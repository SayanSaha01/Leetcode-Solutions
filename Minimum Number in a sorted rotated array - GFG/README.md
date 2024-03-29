# Minimum Number in a sorted rotated array
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array of distinct elements which was initially sorted.&nbsp;This array may be rotated at some unknown point. The task is to find the minimum element in the given sorted and rotated array.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre style="position: relative;"><span style="font-size:18px"><strong>Input:
</strong>N = 10
arr[] = {2,3,4,5,6,7,8,9,10,1}
<strong>Output: </strong>1<strong>
Explanation: </strong>The array is rotated 
once anti-clockwise. So minimum 
element is at last index (n-1) 
which is 1.</span><div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre style="position: relative;"><span style="font-size:18px"><strong>Input:
</strong>N = 5
arr[] = {3,4,5,1,2}
<strong>Output: </strong>1<strong>
Explanation: </strong>The array is rotated 
and the minimum element present is
at index (n-2) which is 1.</span>
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function <strong>minNumber</strong>() which takes the array arr[] and its starting and ending indices (low and high) as inputs and returns the minimum element in the given sorted and rotated array.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(LogN).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(LogN).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>7</sup><br>
1 &lt;= arr[i] &lt;= 10<sup>7</sup></span></p>
</div>