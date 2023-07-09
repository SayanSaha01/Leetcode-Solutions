<h2><a href="https://leetcode.com/problems/relocate-marbles/">2766. Relocate Marbles</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code> representing the initial positions of some marbles. You are also given two <strong style="user-select: auto;">0-indexed </strong>integer arrays <code style="user-select: auto;">moveFrom</code> and <code style="user-select: auto;">moveTo</code> of <strong style="user-select: auto;">equal</strong> length.</p>

<p style="user-select: auto;">Throughout <code style="user-select: auto;">moveFrom.length</code> steps, you will change the positions of the marbles. On the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> step, you will move <strong style="user-select: auto;">all</strong> marbles at position <code style="user-select: auto;">moveFrom[i]</code> to position <code style="user-select: auto;">moveTo[i]</code>.</p>

<p style="user-select: auto;">After completing all the steps, return <em style="user-select: auto;">the sorted list of <strong style="user-select: auto;">occupied</strong> positions</em>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Notes:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">We call a position <strong style="user-select: auto;">occupied</strong> if there is at least one marble in that position.</li>
	<li style="user-select: auto;">There may be multiple marbles in a single position.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,6,7,8], moveFrom = [1,7,2], moveTo = [2,9,5]
<strong style="user-select: auto;">Output:</strong> [5,6,8,9]
<strong style="user-select: auto;">Explanation:</strong> Initially, the marbles are at positions 1,6,7,8.
At the i = 0th step, we move the marbles at position 1 to position 2. Then, positions 2,6,7,8 are occupied.
At the i = 1st step, we move the marbles at position 7 to position 9. Then, positions 2,6,8,9 are occupied.
At the i = 2nd step, we move the marbles at position 2 to position 5. Then, positions 5,6,8,9 are occupied.
At the end, the final positions containing at least one marbles are [5,6,8,9].<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="position: relative; user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,1,3,3], moveFrom = [1,3], moveTo = [2,2]
<strong style="user-select: auto;">Output:</strong> [2]
<strong style="user-select: auto;">Explanation:</strong> Initially, the marbles are at positions [1,1,3,3].
At the i = 0th step, we move all the marbles at position 1 to position 2. Then, the marbles are at positions [2,2,3,3].
At the i = 1st step, we move all the marbles at position 3 to position 2. Then, the marbles are at positions [2,2,2,2].
Since 2 is the only occupied position, we return [2].
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper" style="user-select: auto;"></div></pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= moveFrom.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">moveFrom.length == moveTo.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i], moveFrom[i], moveTo[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;">The test cases are generated such that there is at least a marble in&nbsp;<code style="user-select: auto;">moveFrom[i]</code>&nbsp;at the moment we want to apply&nbsp;the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code>&nbsp;move.</li>
</ul>
</div>