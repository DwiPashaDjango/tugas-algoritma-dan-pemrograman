gol = str(input('Masukan Golongan : '))
kwh = int(input('Masukan Kwh : '))

if gol == 'A' :
    total = 20 * kwh + 5000
    print('Total Pembayaran Listrik Anda Adalah', total)
else:
    total = 30 * kwh + 7500
    print('Total Pembayaran Listrik Anda', total)
