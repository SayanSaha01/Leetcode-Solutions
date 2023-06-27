<h2><a href="https://leetcode.com/problems/minimum-size-subarray-sum/">209. Minimum Size Subarray Sum</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of positive integers <code style="user-select: auto;">nums</code> and a positive integer <code style="user-select: auto;">target</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">minimal length</strong> of a </em><span data-keyword="subarray-nonempty" style="user-select: auto;"><em style="user-select: auto;">subarray</em></span><em style="user-select: auto;"> whose sum is greater than or equal to</em> <code style="user-select: auto;">target</code>. If there is no such subarray, return <code style="user-select: auto;">0</code> instead.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> target = 7, nums = [2,3,1,2,4,3]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The subarray [4,3] has the minimal length under the problem constraint.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> target = 4, nums = [1,4,4]
<strong style="user-select: auto;">Output:</strong> 1
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> target = 11, nums = [1,1,1,1,1,1,1,1]
<strong style="user-select: auto;">Output:</strong> 0
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= target &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<strong style="user-select: auto;">Follow up:</strong> If you have figured out the <code style="user-select: auto;">O(n)</code> solution, try coding another solution of which the time complexity is <code style="user-select: auto;">O(n log(n))</code>.</div>