lines = readlines
lines.each do |words|
  # chompは文字列末尾の改行を取り払うメソッド
  words.chomp.split(' ').each do |word|
    p word
  end
end