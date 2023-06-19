<h2><a href="https://leetcode.com/problems/insertion-sort-list/">147. Insertion Sort List</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">head</code> of a singly linked list, sort the list using <strong style="user-select: auto;">insertion sort</strong>, and return <em style="user-select: auto;">the sorted list's head</em>.</p>

<p style="user-select: auto;">The steps of the <strong style="user-select: auto;">insertion sort</strong> algorithm:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.</li>
	<li style="user-select: auto;">At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.</li>
	<li style="user-select: auto;">It repeats until no input elements remain.</li>
</ol>

<p style="user-select: auto;">The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.</p>
<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif" style="height: 180px; width: 300px; user-select: auto;">
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/04/sort1linked-list.jpg" style="width: 422px; height: 222px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [4,2,1,3]
<strong style="user-select: auto;">Output:</strong> [1,2,3,4]
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/04/sort2linked-list.jpg" style="width: 542px; height: 222px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [-1,5,3,4,0]
<strong style="user-select: auto;">Output:</strong> [-1,0,3,4,5]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the list is in the range <code style="user-select: auto;">[1, 5000]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-5000 &lt;= Node.val &lt;= 5000</code></li>
</ul>
</div>