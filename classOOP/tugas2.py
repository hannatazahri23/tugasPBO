str(input('masukan nama:'))

int(input('masukan NIM:'))

class mobil:
    def __init__(self,nama,cc):
        self.nama = nama
        self.cc = cc

    def menyalakan(self):
        print('mobil', self.nama, 'dengan cc', self.cc, 'sedang menyala')

    def mematikan(self):
        print('mobil', self.nama, 'dengan cc', self.cc, 'sedang mati')

mobil1 = mobil('Honda', '1000')
mobil2 = mobil('Suzuki', '1200')
mobil3 = mobil('Mitsubishi', '1400')

def jalankan():
    print('\nmobil 1')
    mobil1.menyalakan()
    mobil1.mematikan()
    print('\nmobil 2')
    mobil2.menyalakan()
    mobil2.mematikan()
    print('\nmobil 3')
    mobil3.menyalakan()
    mobil3.mematikan()

jalankan()