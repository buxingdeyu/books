found = False
x='abc'
while x and not found:
	if match(x[0]):
		print('Ni')
		found=True
	else:
		x=x[x:]
if not found:
	print('not found')