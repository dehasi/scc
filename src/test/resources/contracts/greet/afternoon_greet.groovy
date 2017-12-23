org.springframework.cloud.contract.spec.Contract.make {
    //ignored()
    request {
        method 'GET'
        urlPath('/greet/afternoon/john')
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