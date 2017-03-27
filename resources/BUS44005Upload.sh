cd /opt/logs/balthree/BUS44005/upload
echo 'connect ftp start '
ftp -n<<!
open 132.129.4.121 21
user portal83 portal83
binary
pormpt
cd BUS44005/upload
mput *
close
bye
!
mv * ../hisUp
