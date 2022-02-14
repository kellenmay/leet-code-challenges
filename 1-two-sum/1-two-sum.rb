# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}


def two_sum(nums, target)
     nums.each_with_index do |num, index|
         if nums.include?(target - num)
             return [index,nums.find_index(target - num)] if index != nums.find_index(target - num)
         end
     end
    return "Couldn't find target value"
end