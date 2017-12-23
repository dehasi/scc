org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        urlPath('/greet/john')
    }
    response {
        status 200
        body(
                '''
                {
                  "greet": "Good afternoon John"
                }
                '''
        )
        headers {
            header('Content-Type', 'application/json;charset=UTF-8')
        }
    }
}