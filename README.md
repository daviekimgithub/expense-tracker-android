# 📱 Pocket Planner

**Pocket Planner** is a modern, cross-platform mobile application for managing personal finances. Built with Kotlin Multiplatform and architected using Clean principles and MVI pattern, it provides robust expense tracking, income logging, budgeting tools, and data visualizations — all while supporting offline functionality and modular scalability.

🔗 [View more details →](https://pocketplannerapp.netlify.app/)

---

## 🧱 Architecture

Pocket Planner is built with **Clean Architecture** and follows the **Model-View-Intent (MVI)** pattern using Orbit MVI. The project is modularized to promote separation of concerns, testability, and maintainability.

### 🔹 Multi-Module Breakdown

* **`presentation/`**: UI screens, navigation, state observers, and view models.
* **`navigation/`**: Navigation interfaces and platform-specific implementations.
* **`theme/`**: App-wide styling (colors, typography, shapes, dimensions).
* **`core/`**: Utilities, mappers, navigation helpers, and result wrappers.
* **`data/`**: Local data sources using SQLDelight, repository implementations.
* **`domain/`**: Business logic, use cases, and domain models.
* **`components/`**: Reusable UI widgets (charts, buttons, dialogs, text fields).
* **`androidMain/`**: Android entry point (`MainActivity.kt`) and resources.
* **`test/`**: Unit tests for data, domain, and presentation layers.

---

## 🛠 Technologies Used

Pocket Planner was developed with a strong focus on **modern mobile engineering best practices**:

| Technology               | Purpose                                                     |
| ------------------------ | ----------------------------------------------------------- |
| **Kotlin Multiplatform** | Shared business logic across Android & iOS                  |
| **Jetpack Compose**      | Declarative UI for Android                                  |
| **Orbit MVI**            | Unidirectional state flow with predictable state management |
| **SQLDelight**           | Type-safe SQL layer for SQLite with multiplatform support   |
| **Koin**                 | Dependency injection for scalable architecture              |
| **Kotlinx Coroutines**   | Asynchronous programming and concurrency                    |
| **Kotlinm-Charts**       | Lightweight charting for financial data visualization       |
| **GitHub Actions**       | CI pipeline for testing and linting codebase                |

---

## 🧪 Testing

Testing is integrated across multiple modules with coverage for:

* ✅ **Data layer**: Mocked repositories and database functions
* ✅ **Domain layer**: Use case logic verification
* ✅ **Presentation layer**: ViewModel state and interaction tests

All test suites are executed via **GitHub Actions**, ensuring reliability and continuous integration.

---

## 🚧 Key Development Challenges

| Challenge                       | Approach                                                            |
| ------------------------------- | ------------------------------------------------------------------- |
| 📱 Cross-platform compatibility | Separated shared logic from platform-specific UI and configurations |
| 🔁 State complexity in MVI      | Leveraged Orbit Core with immutable states and clear side-effects   |
| 📊 Responsive charting          | Optimized Kotlinm-Charts to handle large datasets on mobile         |
| 🌐 Offline data sync            | SQLDelight-backed local storage with queue-based sync strategy      |

---

## 🏆 Notable Achievements

* ⚙️ **Multi-module Clean Architecture** implemented professionally
* 📶 **Offline-first support** with full local data handling
* 📈 **Interactive financial charts** for deeper spending insights
* 🤝 **Shared Kotlin codebase** across Android and iOS
* 🔁 **Continuous Integration** with automated testing

---

## 👨‍💻 Developed By

**Davie Kim**
📍 Action Estate, Eldoret, Kenya

📧 [daviekim.dev@gmail.com](mailto:daviekim.dev@gmail.com)

🌐 [Portfolio Website](https://daviekim.vercel.app)

🌐 [LinkedIn Profile]([https://www.linkedin.com/in/david-njoroge-000882224])

📞 +254 701 143038

---

> 📎 **Project Website:**
> [https://pocketplannerapp.netlify.app/](https://pocketplannerapp.netlify.app/)
