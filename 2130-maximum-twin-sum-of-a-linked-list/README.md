<h2><a href="https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/">2130. Maximum Twin Sum of a Linked List</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">In a linked list of size <code style="user-select: auto;">n</code>, where <code style="user-select: auto;">n</code> is <strong style="user-select: auto;">even</strong>, the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> node (<strong style="user-select: auto;">0-indexed</strong>) of the linked list is known as the <strong style="user-select: auto;">twin</strong> of the <code style="user-select: auto;">(n-1-i)<sup style="user-select: auto;">th</sup></code> node, if <code style="user-select: auto;">0 &lt;= i &lt;= (n / 2) - 1</code>.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, if <code style="user-select: auto;">n = 4</code>, then node <code style="user-select: auto;">0</code> is the twin of node <code style="user-select: auto;">3</code>, and node <code style="user-select: auto;">1</code> is the twin of node <code style="user-select: auto;">2</code>. These are the only nodes with twins for <code style="user-select: auto;">n = 4</code>.</li>
</ul>

<p style="user-select: auto;">The <strong style="user-select: auto;">twin sum </strong>is defined as the sum of a node and its twin.</p>

<p style="user-select: auto;">Given the <code style="user-select: auto;">head</code> of a linked list with even length, return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum twin sum</strong> of the linked list</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/12/03/eg1drawio.png" style="width: 250px; height: 70px; user-select: auto;">
<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [5,4,2,1]
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation:</strong>
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6. 
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/12/03/eg2drawio.png" style="width: 250px; height: 70px; user-select: auto;">
<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [4,2,2,3]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong>
The nodes with twins present in this linked list are:
- Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
- Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
Thus, the maximum twin sum of the linked list is max(7, 4) = 7. 
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/12/03/eg3drawio.png" style="width: 200px; height: 88px; user-select: auto;">
<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [1,100000]
<strong style="user-select: auto;">Output:</strong> 100001
<strong style="user-select: auto;">Explanation:</strong>
There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the list is an <strong style="user-select: auto;">even</strong> integer in the range <code style="user-select: auto;">[2, 10<sup style="user-select: auto;">5</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= Node.val &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>