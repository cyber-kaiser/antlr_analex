grammar morsecode;

morsecode
   : letter (SPACE letter)+
   ;

letter
   : a
   | b
   | c
   | d
   | e
   | f
   | g
   | h
   | i
   | j
   | k
   | l
   | m
   | n
   | o
   | p
   | q
   | r
   | s
   | t
   | u
   | v
   | w
   | x
   | y
   | z
   | one
   | two
   | three
   | four
   | five
   | six
   | seven
   | eight
   | nine
   | zero
   ;

a
   : DOT DASH
   ;

b
   : DASH DOT DOT DOT
   ;

c
   : DASH DOT DASH DOT
   ;

d
   : DASH DOT DOT
   ;

e
   : DOT
   ;

f
   : DOT DOT DASH DOT
   ;

g
   : DASH DASH DOT
   ;

h
   : DOT DOT DOT DOT
   ;

i
   : DOT DOT
   ;

j
   : DOT DASH DASH DASH
   ;

k
   : DASH DOT DASH
   ;

l
   : DOT DASH DOT DOT
   ;

m
   : DASH DASH
   ;

n
   : DASH DOT
   ;

o
   : DASH DASH DASH
   ;

p
   : DOT DASH DASH DOT
   ;

q
   : DASH DASH DOT DASH
   ;

r
   : DOT DASH DOT
   ;

s
   : DOT DOT DOT
   ;

t
   : DASH
   ;

u
   : DOT DOT DASH
   ;

v
   : DOT DOT DOT DASH
   ;

w
   : DOT DASH DASH
   ;

x
   : DASH DOT DOT DASH
   ;

y
   : DASH DOT DASH DASH
   ;

z
   : DASH DASH DOT DOT
   ;

one
   : DOT DASH DASH DASH DASH
   ;

two
   : DOT DOT DASH DASH DASH
   ;

three
   : DOT DOT DOT DASH DASH
   ;

four
   : DOT DOT DOT DOT DASH
   ;

five
   : DOT DOT DOT DOT DOT
   ;

six
   : DASH DOT DOT DOT DOT
   ;

seven
   : DASH DASH DOT DOT DOT
   ;

eight
   : DASH DASH DASH DOT DOT
   ;

nine
   : DASH DASH DASH DASH DOT
   ;

zero
   : DASH DASH DASH DASH DASH
   ;


DOT
   : '.'
   ;


DASH
   : '-'
   ;

SPACE
    : ' '
    ;

WS
   : [\t\r\n] -> skip
   ;
