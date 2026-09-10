# Library Management System (Kütüphane Yönetim Sistemi)

Java ve Nesne Yönelimli Programlama (OOP) prensipleri kullanılarak geliştirilmiş, konsol tabanlı bir kütüphane yönetim sistemi simülasyonudur.

---

## Proje Hakkında

Bu proje; kütüphane envanteri, üye işlemleri, görevli yetkilendirmesi ve kitap ödünç alma/iade süreçlerini modellemek amacıyla hazırlanmıştır.

*  **Kitap Yönetimi:** Kütüphaneye kitap ekleme, listeleme ve durum takibi.
*  **Üye & Görevli İşlemleri:** Üye ve personel rollerinin tanımlanması ve yönetimi.
*  **Ödünç Alma & İade:** Kitapların ödünç verilmesi ve teslim süreçlerinin kontrolü.
*  **OOP Mimarisi:** Kalıtım (Inheritance), Kapsülleme (Encapsulation) ve Polimorfizm prensiplerine uygun sınıf yapısı.

---

##  Proje Yapısı

```text
LibSystem/
├── Genel.java       # Ortak nitelik ve metotları barındıran temel/ata sınıf
├── Gorevli.java     # Personel/Görevli işlemlerini yöneten sınıf
├── Kitap.java       # Kitap nesnesi ve özelliklerini tanımlayan sınıf
├── Kutuphane.java   # Kütüphane veri yapısı ve operasyonel mantığı içeren sınıf
├── Uye.java         # Kütüphane üyelerini temsil eden sınıf
└── Main.java        # Uygulamanın başlangıç noktası ve akış senaryosu
