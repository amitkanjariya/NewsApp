# 📰 NewsApp

**NewsApp** is a modern and lightweight Android news reader application developed using **Kotlin** and **XML layouts**. It integrates the **NewsAPI** to deliver real-time news from around the globe. Built as part of an academic project, this app showcases practical implementation of the **MVVM architecture**, **Room Database**, and **Jetpack components**, while offering a clean and intuitive user experience.

Whether you're looking to stay up-to-date with the latest headlines or save your favorite articles for offline reading, NewsApp provides a fast, responsive, and secure solution.

---

## 🚀 Features

- 📰 **Headlines Page** – Displays latest top news in a RecyclerView
- 🔍 **Search Functionality** – Find articles by keyword/topic
- ⭐ **Favorites** – Save articles locally using Room DB
- 📴 **Offline Support** – Access favorites without internet
- 🔒 **Secure API Keys** – Protected via local.properties
- ⚡ **Optimized Performance** – Glide for smooth image loading
- 🧠 **Modern Architecture** – MVVM with ViewModel, LiveData & Coroutines
- 💡 **Clean UI** – Intuitive navigation with Jetpack Navigation

---

## ⚙️ Tech Stack

- **Language**: Kotlin  
- **UI**: XML + ViewBinding  
- **Network**: Retrofit 2.x  
- **Local DB**: Room Database  
- **Image Loading**: Glide 4.x  
- **Navigation**: Jetpack Navigation Component  
- **Architecture**: MVVM Pattern  
- **Concurrency**: Kotlin Coroutines  
- **API**: NewsAPI.org

---

## 📦 Dependencies

```gradle
// Key dependencies (update versions as needed):
def retrofit_version = "2.9.0"
def glide_version = "4.13.2"
def room_version = "2.4.3"

implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
implementation "com.github.bumptech.glide:glide:$glide_version"
implementation "androidx.room:room-ktx:$room_version"
