(ns desafio-clojure.core)

; ------ DADOS ESTATICOS  ---------
(def cliente {:nome "Pedro" :cpf "12412412401" :email "pedro.henrique@nubank.com.br"})
(def cartao-de-credito {:numero "1234123412341234" :cvv "123" :validade "09/29" :limite 5000})

; ------ DADOS DO CLIENTE  ---------
(defn exibir-dados-cliente
  "Exibe dados de um cliente"
  [cliente]
  (println "\n")
  (println "--- Dados do cliente ---")
  (println "Nome:" (get cliente :nome ",")
           "CPF:" (get cliente :cpf ",")
           "Email:" (get cliente :email)))


; ------ DADOS DO CARTÃO  ---------
(defn exibir-dados-cartao
  "Exibe dados de um cartao"
  [cartao]
  (println "\n")
  (println "--- Dados do cartão ---")
  (println "Número do cartão:" (get cartao :numero ",")
           "CVV:" (get cartao :cvv ",")
           "Validade:" (get cartao :validade ",")
           "Limite:" (get cartao :limite)))

(exibir-dados-cartao cartao-de-credito)
(exibir-dados-cliente cliente)

; ------ COMPRAS REALIZADAS ---------
(def compras-realizadas [
                         {:data "12/01/2021" :valor 23.59 :estabelecimento "Uber" :categoria "Aplicativos"},
                         {:data "25/06/2021" :valor 55 :estabelecimento "Netflix" :categoria "Entretenimento"},
                         {:data "30/03/2021" :valor 0.59 :estabelecimento "Padaria" :categoria "Alimentação"}])

(defn formatar-compra
  "Formatar visualmente a compra"
  [compra]
  (let  [{data :data
         valor :valor
         estabelecimento :estabelecimento
         categoria :categoria}compra]
  (println "Data:" data
             "Valor:" valor
             "Estabelecimento:" estabelecimento
             "Categoria:" categoria)))

(defn listagem-compras-realizadas
  "Listagem de todas as compras realizadas"
  [compras]
  (println "\n")
  (println "--- Todas as compras realizadas ---")
  (map formatar-compra compras)
  )

(listagem-compras-realizadas compras-realizadas)















