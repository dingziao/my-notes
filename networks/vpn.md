## WSL visit google.com via Clash@Win

### 1. Get Windows host IP address in WSL:

```bash
$ ip route | grep default
<default via 172.x.x.1 dev eth0 proto kernel>
```



```bash
curl -x http://172.x.x.1:7890 -I https://www.google.com
<is not working.>
```

### 2. Confirm proxy service (Clash) is listening on the correct interface in Windows:

```powershell
$ netstat -ano | findstr :7890
<127.0.0.1:7890 → Clash only listen to Win Localhost. Should Enable "Allow LAN" in Clash@Win>
<0.0.0.0:7890 → Good. Clash is listening to all interface.>
```
```bash
curl -x http://172.x.x.1:7890 -I https://www.google.com
<should works now.>
```

```bash
curl -I https://www.google.com
<still not working.>
```


### 3. In WSL:

```bash
echo 'export http_proxy=http://172.x.x.1:7890' >> ~/.bashrc
echo 'export https_proxy=http://172.x.x.1:7890' >> ~/.bashrc
source ~/.bashrc
```

```bash
curl -I https://www.google.com
<should works now.>
```


