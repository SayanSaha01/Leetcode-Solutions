<h2><a href="https://leetcode.com/problems/merge-in-between-linked-lists/">1669. Merge In Between Linked Lists</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two linked lists: <code style="user-select: auto;">list1</code> and <code style="user-select: auto;">list2</code> of sizes <code style="user-select: auto;">n</code> and <code style="user-select: auto;">m</code> respectively.</p>

<p style="user-select: auto;">Remove <code style="user-select: auto;">list1</code>'s nodes from the <code style="user-select: auto;">a<sup style="user-select: auto;">th</sup></code> node to the <code style="user-select: auto;">b<sup style="user-select: auto;">th</sup></code> node, and put <code style="user-select: auto;">list2</code> in their place.</p>

<p style="user-select: auto;">The blue edges and nodes in the following figure indicate the result:</p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/fig1.png" style="height: 130px; width: 504px; user-select: auto;">
<p style="user-select: auto;"><em style="user-select: auto;">Build the result list and return its head.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/merge_linked_list_ex1.png" style="width: 406px; height: 140px; user-select: auto;">
<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
<strong style="user-select: auto;">Output:</strong> [0,1,2,1000000,1000001,1000002,5]
<strong style="user-select: auto;">Explanation:</strong> We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/merge_linked_list_ex2.png" style="width: 463px; height: 140px; user-select: auto;">
<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
<strong style="user-select: auto;">Output:</strong> [0,1,1000000,1000001,1000002,1000003,1000004,6]
<strong style="user-select: auto;">Explanation:</strong> The blue edges and nodes in the above figure indicate the result.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">3 &lt;= list1.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= a &lt;= b &lt; list1.length - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= list2.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>