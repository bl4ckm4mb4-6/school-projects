# Java TCP Quote Server

A Client-Server application based on TCP Sockets in Java. The client sends a numeric request and the server responds with a motivational quote.

## 🛠️ Technologies Used
* **Java 8+**
* **TCP/IP Sockets** (`java.net.Socket`, `java.net.ServerSocket`)
* **I/O Streams** (`BufferedReader`, `PrintWriter`)
* **Eclipse IDE**


## 🚀 How to Run It

1. **Compile the files:**

```bash
	javac esercizi/ServerCitazioni.java esercizi/ClientCitazioni.java
```


2. **Start the Server:**

```bash
	java esercizi.ServerCitazioni
```


3. **In another terminal, start the Client:**

```bash
	java esercizi.ClientCitazioni
```

You can also run files in the Eclipse IDE or your favourite IDE.


## 🧠 What I learned

- How to manage the handshake and communication between local processes (localhost).
- Management of network Input/Output streams in Java.
