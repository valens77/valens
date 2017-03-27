cd /opt/logs/balthree/BUS44004/upload
echo 'connect ftp start '
ftp -n<<!
open 132.129.4.121 21
user portal83 portal83
binary
cd BUS44004/upload
prompt
mput *
close
bye
!
mv * ../hisUp

