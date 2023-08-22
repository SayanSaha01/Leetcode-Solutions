<h2><a href="https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/">2824. Count Pairs Whose Sum is Less than Target</a></h2><h3>Easy</h3><hr><div style="user-select: auto;">Given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code> of length <code style="user-select: auto;">n</code> and an integer <code style="user-select: auto;">target</code>, return <em style="user-select: auto;">the number of pairs</em> <code style="user-select: auto;">(i, j)</code> <em style="user-select: auto;">where</em> <code style="user-select: auto;">0 &lt;= i &lt; j &lt; n</code> <em style="user-select: auto;">and</em> <code style="user-select: auto;">nums[i] + nums[j] &lt; target</code>.
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [-1,1,2,3,1], target = 2
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> There are 3 pairs of indices that satisfy the conditions in the statement:
- (0, 1) since 0 &lt; 1 and nums[0] + nums[1] = 0 &lt; target
- (0, 2) since 0 &lt; 2 and nums[0] + nums[2] = 1 &lt; target 
- (0, 4) since 0 &lt; 4 and nums[0] + nums[4] = 0 &lt; target
Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [-6,2,5,-2,-7,-1,3], target = -2
<strong style="user-select: auto;">Output:</strong> 10
<strong style="user-select: auto;">Explanation:</strong> There are 10 pairs of indices that satisfy the conditions in the statement:
- (0, 1) since 0 &lt; 1 and nums[0] + nums[1] = -4 &lt; target
- (0, 3) since 0 &lt; 3 and nums[0] + nums[3] = -8 &lt; target
- (0, 4) since 0 &lt; 4 and nums[0] + nums[4] = -13 &lt; target
- (0, 5) since 0 &lt; 5 and nums[0] + nums[5] = -7 &lt; target
- (0, 6) since 0 &lt; 6 and nums[0] + nums[6] = -3 &lt; target
- (1, 4) since 1 &lt; 4 and nums[1] + nums[4] = -5 &lt; target
- (3, 4) since 3 &lt; 4 and nums[3] + nums[4] = -9 &lt; target
- (3, 5) since 3 &lt; 5 and nums[3] + nums[5] = -3 &lt; target
- (4, 5) since 4 &lt; 5 and nums[4] + nums[5] = -8 &lt; target
- (4, 6) since 4 &lt; 6 and nums[4] + nums[6] = -4 &lt; target
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length == n &lt;= 50</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-50 &lt;= nums[i], target &lt;= 50</code></li>
</ul>
</div>