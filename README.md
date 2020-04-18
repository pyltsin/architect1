Запуск всех файлов

` kubectl apply -f deployment.yaml -f Service.yaml -f ingress.yaml `

Проверка запросом

`curl -H 'Host: arch.homework' http://192.168.99.100/otusapp/health`