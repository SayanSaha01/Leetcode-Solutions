<h2><a href="https://leetcode.com/problems/next-greater-node-in-linked-list/">1019. Next Greater Node In Linked List</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given the <code style="user-select: auto;">head</code> of a linked list with <code style="user-select: auto;">n</code> nodes.</p>

<p style="user-select: auto;">For each node in the list, find the value of the <strong style="user-select: auto;">next greater node</strong>. That is, for each node, find the value of the first node that is next to it and has a <strong style="user-select: auto;">strictly larger</strong> value than it.</p>

<p style="user-select: auto;">Return an integer array <code style="user-select: auto;">answer</code> where <code style="user-select: auto;">answer[i]</code> is the value of the next greater node of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> node (<strong style="user-select: auto;">1-indexed</strong>). If the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> node does not have a next greater node, set <code style="user-select: auto;">answer[i] = 0</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/08/05/linkedlistnext1.jpg" style="width: 304px; height: 133px; user-select: auto;">
<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [2,1,5]
<strong style="user-select: auto;">Output:</strong> [5,5,0]
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/08/05/linkedlistnext2.jpg" style="width: 500px; height: 113px; user-select: auto;">
<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [2,7,4,3,5]
<strong style="user-select: auto;">Output:</strong> [7,0,5,5,0]
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the list is <code style="user-select: auto;">n</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= Node.val &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
</ul>
</div>