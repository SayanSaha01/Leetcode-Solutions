<h2><a href="https://leetcode.com/problems/minimum-index-of-a-valid-split/">2780. Minimum Index of a Valid Split</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">An element <code style="user-select: auto;">x</code> of an integer array <code style="user-select: auto;">arr</code> of length <code style="user-select: auto;">m</code> is <strong style="user-select: auto;">dominant</strong> if <code style="user-select: auto;">freq(x) * 2 &gt; m</code>, where <code style="user-select: auto;">freq(x)</code> is the number of occurrences of <code style="user-select: auto;">x</code> in <code style="user-select: auto;">arr</code>. Note that this definition implies that <code style="user-select: auto;">arr</code> can have <strong style="user-select: auto;">at most one</strong> dominant element.</p>

<p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code> of length <code style="user-select: auto;">n</code> with one dominant element.</p>

<p style="user-select: auto;">You can split <code style="user-select: auto;">nums</code> at an index <code style="user-select: auto;">i</code> into two arrays <code style="user-select: auto;">nums[0, ..., i]</code> and <code style="user-select: auto;">nums[i + 1, ..., n - 1]</code>, but the split is only <strong style="user-select: auto;">valid</strong> if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= i &lt; n - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums[0, ..., i]</code>, and <code style="user-select: auto;">nums[i + 1, ..., n - 1]</code> have the same dominant element.</li>
</ul>

<p style="user-select: auto;">Here, <code style="user-select: auto;">nums[i, ..., j]</code> denotes the subarray of <code style="user-select: auto;">nums</code> starting at index <code style="user-select: auto;">i</code> and ending at index <code style="user-select: auto;">j</code>, both ends being inclusive. Particularly, if <code style="user-select: auto;">j &lt; i</code> then <code style="user-select: auto;">nums[i, ..., j]</code> denotes an empty subarray.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> index of a <strong style="user-select: auto;">valid split</strong></em>. If no valid split exists, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,2,2]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> We can split the array at index 2 to obtain arrays [1,2,2] and [2]. 
In array [1,2,2], element 2 is dominant since it occurs twice in the array and 2 * 2 &gt; 3. 
In array [2], element 2 is dominant since it occurs once in the array and 1 * 2 &gt; 1.
Both [1,2,2] and [2] have the same dominant element as nums, so this is a valid split. 
It can be shown that index 2 is the minimum index of a valid split. </pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,1,3,1,1,1,7,1,2,1]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> We can split the array at index 4 to obtain arrays [2,1,3,1,1] and [1,7,1,2,1].
In array [2,1,3,1,1], element 1 is dominant since it occurs thrice in the array and 3 * 2 &gt; 5.
In array [1,7,1,2,1], element 1 is dominant since it occurs thrice in the array and 3 * 2 &gt; 5.
Both [2,1,3,1,1] and [1,7,1,2,1] have the same dominant element as nums, so this is a valid split.
It can be shown that index 4 is the minimum index of a valid split.</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [3,3,3,3,7,2,2]
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong> It can be shown that there is no valid split.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums</code> has exactly one dominant element.</li>
</ul>
</div>