# k8s中部署traefik

```bash
$ kubectl apply -f crd.yaml
$ kubectl apply -f rbac.yaml
$ kubectl apply -f deployment.yaml
$ kubectl apply -f dashboard.yaml
```

浏览器访问 http://dashboard.traefik.com 即可访问到traefik的dashboard

注：在 docker for mac环境下由于网络环境原因需要做kubectl port-forward

```bash
$ kubectl port-forward pods/traefik-6f8f9c9d56-mltlz 8080:8080 -n kube-system
```

# 参考文档

https://docs.traefik.io

https://www.qikqiak.com/traefik-book
