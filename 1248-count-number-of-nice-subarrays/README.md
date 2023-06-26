<h2><a href="https://leetcode.com/problems/count-number-of-nice-subarrays/">1248. Count Number of Nice Subarrays</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of integers <code style="user-select: auto;">nums</code> and an integer <code style="user-select: auto;">k</code>. A continuous subarray is called <strong style="user-select: auto;">nice</strong> if there are <code style="user-select: auto;">k</code> odd numbers on it.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the number of <strong style="user-select: auto;">nice</strong> sub-arrays</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,1,2,1,1], k = 3
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,4,6], k = 1
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> There is no odd numbers in the array.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,2,2,1,2,2,1,2,2,2], k = 2
<strong style="user-select: auto;">Output:</strong> 16
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 50000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10^5</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= nums.length</code></li>
</ul></div>