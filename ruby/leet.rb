input_line = gets
strings = input_line.to_s.split('')

convert = []
strings.each do |chara|
    case chara
    when "A" then
        convert.push("4")
    when "E" then
        convert.push("3")
    when "G" then
        convert.push("6")
    when "I" then
        convert.push("1")
    when "O" then
        convert.push("0")
    else
        convert.push(chara)
    end
end

# joinは配列の要素を連結して文字列を作り出す
output = convert.join
puts output