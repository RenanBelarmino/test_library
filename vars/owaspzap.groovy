def call(String url) {
    sh 'docker pull owasp/zap2docker-stable'
    sh 'docker run -v $(pwd):/zap/wrk/:rw -t owasp/zap2docker-stable zap-full-scan.py -t ${url} -g gen.conf -r testreport.html'
}
